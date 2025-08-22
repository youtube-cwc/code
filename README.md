📌 PII Data Masking in Spring Boot

Welcome 👋!
This project is part of my YouTube tutorial where I show how to mask sensitive customer data (PII) like phone numbers and club card numbers in a Spring Boot application.

🧐 What is PII Masking?

PII stands for Personally Identifiable Information – things like phone numbers, card numbers, email addresses, etc.

➡️ If we expose them directly from our API, it’s a security risk.
➡️ Masking means we hide part of the value before sending it back to the client.

Example:

Phone number 9876543210 → xxxxxx3210

Club card 1234-5678-9012-3456 → XXXX-XXXX-XXXX-3456

🚀 Features of this Project

✅ Spring Boot REST API

✅ JPA + H2 (in-memory DB)

✅ Custom annotation @MaskData

✅ Jackson Serializer PIIHide for masking

✅ Demo API tested with Postman

🛠️ Tech Stack

Java 17+
Spring Boot 3+
Maven
Lombok
Jackson


▶️ How to Run the Project

Clone this repo

git clone https://github.com/youtube-cwc/code.git
cd code


Build and run with Maven

./mvnw spring-boot:run


API Endpoint

GET http://localhost:8080/customer/1

📸 Demo
🔴 Before Masking (unsafe response)
{
  "id": 1,
  "name": "John Doe",
  "phoneNumber": "9876543210",
  "clubCardNumber": "1234-5678-9012-3456"
}

🟢 After Masking (safe response)
{
  "id": 1,
  "name": "John Doe",
  "phoneNumber": "xxxxxx3210",
  "clubCardNumber": "XXXX-XXXX-XXXX-3456"
}


👉 (Insert Postman screenshots here for better engagement)

🎥 YouTube Tutorial

📺 Watch the full tutorial here 👉 [Your YouTube Link]

🤝 Contributing

Found a bug? Open an issue.

Have a suggestion? Create a pull request.

📜 License

Licensed under MIT License – free to use & modify.
