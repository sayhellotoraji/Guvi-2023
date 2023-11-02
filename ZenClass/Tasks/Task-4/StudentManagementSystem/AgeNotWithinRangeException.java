package StudentManagementSystem;

// User Defined Exception for Age Validation
// Age not within 15 - 21
class AgeNotWithinRangeException extends Exception {

    AgeNotWithinRangeException(String message) {
        super(message);
    }
}