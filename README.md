# CacheDB 🗄️

An in-memory key-value database system with TTL (Time To Live) support, data persistence through serialization, efficient background expiration using daemon threads, and thread-safe operations.  
Built entirely in Java using advanced OOP principles, Lambdas, Streams, and Synchronization.

---

## 🚀 Features
- Store key-value pairs with optional TTL (default 300 seconds).
- Support for single (`PUT`, `GET`, `DEL`, `SAVE`) and multiple (`MPUT`, `MGET`, `MDEL`) operations.
- Concurrent multi-key operations (MPUT, MGET, MDEL) for high efficiency.
- Persistent file storage using serialization (`SAVE` command).
- Efficient background cleanup of expired keys using daemon threads.
- Full thread safety for all operations and file management.
- Use of Java Lambdas and Stream API for cleaner and modern code.

---

## 🛠️ Tech Stack
- Java 17
- Gradle (build tool)
- IntelliJ IDEA (recommended IDE)

---

## 📂 Project Structure
- `src/main/java/com/cachedb/server/App.java` – Main entry point (with command-line interaction loop).
- `src/main/resources/generated/` – Directory where saved `.bin` files are stored.
- `build.gradle` – Project build configuration.

---

## 🧩 Supported Commands
| Command | Description |
|:---|:---|
| `PUT <key> { username: <username>, userdata: <userdata> } TTL` | Insert or update a single key-value pair. |
| `MPUT [<key> { username: <username>, userdata: <userdata> }, ...] TTL` | Concurrent insertion of multiple key-value pairs. |
| `GET <key>` | Retrieve the username associated with a key. |
| `MGET [<key>, <key>, ...]` | Concurrent retrieval of multiple usernames. |
| `DEL <key>` | Delete a key-value pair from memory. |
| `MDEL [<key>, <key>, ...]` | Concurrent deletion of multiple keys. |
| `SAVE <key>` | Serialize and save a key-value pair to a file (`<key>.bin`). |
| `STOP` | Gracefully shut down the database (`Adios!`). |

---

## 🖥️ How to Run the Application

### 1. Clone the Repository
```bash
git clone https://github.com/manitcodes247/CacheDBManit.git
