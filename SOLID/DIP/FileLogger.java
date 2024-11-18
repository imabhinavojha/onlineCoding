package SOLID.DIP;

class FileLogger {
    public String log(String message) {
        return message;
    }
}

class LogManager {
     FileLogger fileLogger = new FileLogger();

//    public LogManager() {
//        this.fileLogger = new FileLogger();
//    }

    public String logMessage(String message) {
       return fileLogger.log(message);
    }

    public static void main(String[] args) {
        LogManager obj = new LogManager();
        System.out.println(obj.logMessage("Hi dsgedhgfh  U"));
    }
}