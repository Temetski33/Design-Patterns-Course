package chainOfResponsibility;

public class Message {
    String content;
    String senderEmail;
    enum type {
        compensationClaim,
        contactRequest,
        developmentSuggestion,
        generalFeedback
    }
}
