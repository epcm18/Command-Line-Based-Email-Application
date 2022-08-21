# Command-Line-Based-java-email-client
Simple command line base application that can send emails to any recipients. Implemented using java and oop concepts.

# java email client
A java based command-line application that uses Java Mail API to send emails and modified to save the emails sent using serialization and deserialization.

# Java Object Serialization
All the emails sent out by the email client is saved into the hard disk, in the form of objects – Object serialization. The user should be able to retrieve information of all the mails sent on a particular day by using a command-line option - Object deserialization.

# Goals
A program which support to send emails without accessing a browser and to serialize the emails that program sent.

# Purpose
This Application is used for sending emails to different types of recipients according to their positions.

# Scope
1. This source file named EmailClient is the one user interacts.
2. Sending emails were performed by using java mail.
3. Mail Server like yahoo, Gmail, Hotmail, outlook can be used for accessing the mail send by the sender.

Additional - 
    Sent a birthday wish to saved recipients automatically when the program starts.

# Deliverables
A command-line capable of:
   1. Adding a new recipient
   2. Sending an email
   3. Printing out all the names of recipients who have their birthday set to current date
   4. Printing out details (subject and recipient) of all the emails sent on a date specified by user input
   5. Printing out the number of recipient objects in the application

# Knowledge Areas Needed for Project
1. Basic Programming Concepts
2. Java Programming Language
3. Object Orientated Programming Concepts
4. Objects Serialization & Deserialization

# Requirements
1. JavaMail API
2. Activation Jar file

# General Constraints
The sender email-id and password is required. The mail will be sent to particular server.

# Dependencies
These are some following Dependencies:
1. The system is having a secured internet connection.

# Additional Comments
1. User interface - "EmailClient.java"
2. Java mail implementation - "Mail.java"
3. Object serialization and deserialization - "SentWish.java"
