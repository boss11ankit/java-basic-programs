import java.util.Scanner;
public class book_suggestor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("select from the above generas of books ('history','action','romance','horror','sprituality'):");
        String genre = sc.nextLine();
        String suggestion;
        switch (genre) {
            case "history":
                suggestion = "I suggest you read 'Sapiens: A Brief History of Humankind' by Yuval Noah Harari.";
                break;
            case "action":
                suggestion = "I suggest you read 'The Hunger Games' by Suzanne Collins.";
                break;
            case "romance":
                suggestion = "I suggest you read 'Pride and Prejudice' by Jane Austen.";
                break;
            case "horror":
                suggestion = "I suggest you read 'The Shining' by Stephen King.";
                break;
            case "spirituality":
                suggestion = "I suggest you read 'The Power of Now' by Eckhart Tolle.";
                break;
            default:
                suggestion = "Invalid genre selected. Please choose from 'history', 'action', 'romance', 'horror', or 'spirituality'.";
                break;
        }


        System.out.println(suggestion);
        sc.close();
    }
}


