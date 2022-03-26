import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {
    private List<String> intro = Arrays.asList(
            "It's been great talk to you but ",
            "I gotta run, ",
            "Look over there! ",
            "Sorry to do this but ",
            "Sorry to interrupt you but ",
            "Give your family my best because ",
            "I wish I could talk but ",
            "I just got a text: "
    );
    private List<String> scapegoat = Arrays.asList(
            "my dog ",
            "my mother ",
            "Joe biden ",
            "my high school basketball team ",
            "Amber Heard ",
            "a mall Santa ",
            "my Harry Potter cardboard cutout ",
            "my imaginary girlfriend "
    );
    private List<String> emergency = Arrays.asList(
            "isn't going to make it ",
            "just broke into my house ",
            "crashed my car ",
            "just came back to life ",
            "fell in the neighbor's pool ",
            "is splitting an antom in my backyard ",
            "got assaulted by a mailman ",
            "peed on a little girl's lemonade stand "
    );

    private int repeat;

    public Generator(int repeat) {
        this.repeat = repeat;
    }

    public ArrayList<String> generateExcuse() {
        ArrayList<String> excuse = new ArrayList<String>();
        for (int i = 0; i < repeat; i++) {
            Random rand = new Random();
            String randIntro = intro.get(rand.nextInt(intro.size()));
            String randScapegoat = scapegoat.get(rand.nextInt(scapegoat.size()));
            String randEmergency = emergency.get(rand.nextInt(emergency.size()));
            String randExcuse = randIntro + randScapegoat + randEmergency;
            excuse.add(randExcuse);
        }
        return excuse;
    }
}
