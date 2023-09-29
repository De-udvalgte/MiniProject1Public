# MiniProject1

*Made by: Jonas, Louise, Maria, Peter & Mie*


## Description
This project is a simple implementation of SOAP and REST web services, and it is implemented using Java and Spring Boot. The project is a email-messaging-program that can send one or a list of email-users an email with a message and an attachment.


## Endpoints
The project can perform basic POST operations to send emails through two rest-endpoints. The endpoints are listed below:

| HTTP Method | Endpoint       | Description                            | Body        |
|-------------|:---------------|:---------------------------------------|-------------|
| POST        | /api/email     | Sends an email to one email-user       | email, name |
| POST        | /api/email/all | Sends emails to a list of email-users  |             |


## List of webservices 
The project are using the following webservices:
- *SOAP*: https://trial.serviceobjects.com/gpp/soap.svc?wsdl (Folder: src/main/java/client)
- *REST*: https://api.genderize.io 

## Create a .yml file with email credentials etc.
Create a file called `application-dev.yml` in the `resources` folder. We are using a free gmail account to send emails, but you can use another smtp host if you want.
Replace the values in the file with your own credentials.

The file should contain the following:


```
#Server
SERVER_PORT: 9000
ACTIVE_PROFILE: dev


#Email Config
EMAIL_HOST: smtp.gmail.com   <or another smtp host>
EMAIL_PORT: 587              <or another smtp port>
EMAIL_ID: <your-email>
EMAIL_PASSWORD: <your-password>
```

OBS: EMAIL_PASSWORD is not your regular gmail password, but a password that you have to generate in your gmail account. You can read more about it here: https://support.google.com/mail/answer/185833?hl=en-GB

## Create a text file with email users
In order to use the `/api/email/all` endpoint, you need to create a text file with a list of email users.
Create `data.txt` in the `resources/files` folder. The file should contain a list of email users, each on a new line, and it should look like this:

```
Allan, aa@mail.dk, xx.xx.xxx.xx
Bunny, bb@mail.dk, xx.xx.xxx.xx
...
```
(Name, Email and IP-address)


