# 🎂 সহপাঠীর জন্মদিন ম্যানেজার (Java + MySQL)

## 📌 বৈশিষ্ট্যসমূহ:
- ➕ জন্মদিন যোগ করুন
- ✏️ তথ্য আপডেট করুন
- ❌ জন্মদিন ডিলিট করুন
- 📅 আগত জন্মদিন দেখুন (Sorted)
- 🔍 নাম বা মাস দিয়ে সার্চ করুন
- 🎉 আজকের জন্মদিনের নোটিফিকেশন
- 🈳 সমস্ত UI বাংলা ভাষায়

## 🛠️ টেকনোলজি:
- Java (UI)
- MySQL (Database)
- JDBC (Connectivity)

## 🗃️ ডেটাবেস স্ট্রাকচার:
```sql
CREATE DATABASE birthday_db;
USE birthday_db;

CREATE TABLE birthdays (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    dob DATE
);
