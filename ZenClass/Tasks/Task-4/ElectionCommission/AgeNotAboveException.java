package ElectionCommission;

// User Defined Exception for Age Eligibility
// Person age should be >=18
class AgeNotAboveException extends Exception {

    AgeNotAboveException(String message) {
        super(message);
    }
}