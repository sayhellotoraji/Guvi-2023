package StudentManagementSystem;

// User Defined Exception for Name Validation
// Name Should not contain numbers / Special symbols
class NameNotValidException extends Exception {

    NameNotValidException(String message) {
        super(message);
    }
}