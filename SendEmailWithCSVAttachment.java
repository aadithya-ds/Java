package response_preview;

import java.io.File;
import java.io.FileWriter;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmailWithCSVAttachment {

    public static void main(String[] args) {

        // Edit these details with your information
        String senderEmail = "your_email@example.com";
        String senderPassword = "your_password";
        String recipientEmail = "recipient@example.com";
        String subject = "Email with CSV Attachment";

        // Create a temporary CSV file
        String csvFilename = "data.csv";
        File csvFile = new File(csvFilename);

        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.write("Name,Age,City\n");
            writer.write("John Doe,30,New York\n");
            writer.write("Jane Smith,25,London\n");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error creating CSV file!");
            return;
        }

        // Configure email properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.example.com"); // Replace with your SMTP host
        props.put("mail.smtp.port", "587"); // Replace with your SMTP port

        // Create a session with authentication
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create a message object
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject(subject);

            // Create a multipart message for body and attachment
            MimeMultipart multipart = new MimeMultipart();

            // Add body text (optional)
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This is some message body content.");
            multipart.addBodyPart(messageBodyPart);

            // Add CSV attachment
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(csvFile);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("data.csv"); // Optional: Set a different filename for attachment
            multipart.addBodyPart(messageBodyPart);

            // Set the message content
            message.setContent(multipart);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully with CSV attachment!");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Error sending email!");
        } finally {
            // Delete the temporary CSV file (optional)
            csvFile.delete();
        }
    }
}
