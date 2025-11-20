💳 Advanced ATM System (Java OOP Project)
A fully functional ATM simulation system built using Object-Oriented Programming (OOP) principles in Java.
This project includes PIN-based authentication, transaction history, deposit/withdraw, and a modular multi-file structure, making it suitable for job applications, GitHub portfolios, and learning OOP concepts.

ATM-Project/
├── Main.java
├── ATM.java
├── Account.java
├── Transaction.java
└── utils/
     └── InputValidator.java

     
| File                    | Purpose                                          |
| ----------------------- | ------------------------------------------------ |
| **Main.java**           | Entry point of the application                   |
| **ATM.java**            | Contains ATM operations & user interaction logic |
| **Account.java**        | Handles balance, PIN, and transaction history    |
| **Transaction.java**    | Transaction model (for future enhancements)      |
| **InputValidator.java** | Utility class for validating inputs              |


✨ Features
✅ Secure Login

3 PIN attempts

Automatic exit after failed attempts

Easy to modify PIN in Account.java

💵 Banking Operations

Withdraw

Deposit

Check balance

View transaction history

📜 Transaction History

Stores:

Deposit logs

Withdrawal logs

Timestamp support (optional for extension)

🧱 Clean OOP Design

Encapsulation

Classes divided by responsibility


🚀 How to Run This Project
1. Clone the Repository
git clone https://github.com/yourusername/ATM-Project.git
cd ATM-Project

2. Compile the Java Files
javac Main.java ATM.java Account.java Transaction.java utils/InputValidator.java

3. Run the Program
java Main

🖥️ Sample Output

Enter PIN: ****
Login Successful!

====== ATM MENU ======
1. Withdraw Money
2. Deposit Money
3. Check Balance
4. Transaction History
5. EXIT
Choose an option:

📦 Requirements

Java JDK 8 or higher

Any Java-supported IDE (VS Code, IntelliJ IDEA, Eclipse)

📌 Future Enhancements

You can enhance this project with:

🔐 Multiple user accounts

🧵 Database integration (MySQL / PostgreSQL)

🖥️ GUI using Swing/JavaFX

🌐 Online banking simulation (REST API)

📄 Printable transaction reports

(If you want, I can build these versions for you.)

🧑‍💻 Author

Your Name
Java Developer | DevOps | Cloud Engineer
📧 your.email@example.com

🔗 GitHub: https://github.com/yourusername

⭐ Like this project?

If this helped you, consider giving a ⭐ star on GitHub!
It motivates me to build more helpful projects. ❤️



Easy to extend (add multiple users, banks, database integration, etc.)
