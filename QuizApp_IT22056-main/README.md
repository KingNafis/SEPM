# Bangladesh Quiz Application

A JavaFX-based quiz application that tests your knowledge about Bangladesh. The application connects to a MySQL database to fetch questions and store player scores.

## Features

- 🎯 **Random Quiz Generation**: Selects 5 random questions from a pool of 20+ questions
- ⏰ **Timer System**: 30-second timer for each question
- 💾 **Database Integration**: Stores player names and scores in MySQL database
- 🏆 **Score Tracking**: Saves and displays quiz results
- 🚪 **Exit Anytime**: Can terminate or restart the quiz at any point
- 📊 **Performance Feedback**: Shows percentage and performance level
- 🎨 **Modern UI**: Clean, responsive JavaFX interface

## Database Schema

The application uses two main tables:

### Questions Table
```sql
CREATE TABLE questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT,
    a VARCHAR(255),
    b VARCHAR(255),
    c VARCHAR(255),
    d VARCHAR(255),
    correct VARCHAR(255)
);
```

### Scores Table (Auto-created)
```sql
CREATE TABLE scores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    player_name VARCHAR(255) NOT NULL,
    score INT NOT NULL,
    total_questions INT NOT NULL,
    date_played TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

## Prerequisites

- Java 11 or higher
- JavaFX 19 or higher
- MySQL Server running
- Maven 3.6+ (for building)
