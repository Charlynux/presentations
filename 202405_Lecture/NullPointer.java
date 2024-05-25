import java.util.Locale;

public class NullPointer {
    public static void main (String[] args) {
        TranslationService service = new TranslationService();
        DataBox data = new DataBox(null);
        UserPreferences userPrefs = new UserPreferences(Locale.FRANCE);

        System.out.println(service.translate(data.getMessage().getContent(), userPrefs.getLocale()));
    }

    private static class TranslationService {
        String translate(String message, Locale locale) {
            return message;
        }
    }

    private static class Message {
        private String content;

        public Message(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }

    private static class DataBox {
        private Message message;

        public DataBox(Message message) {
            this.message = message;
        }

        public Message getMessage() {
            return message;
        }
    }

    private static class UserPreferences {
        private Locale locale;

        public UserPreferences(Locale locale) {
            this.locale = locale;
        }

        public Locale getLocale() {
            return locale;
        }
    }
}