package dune.file.dunetextgame;

public class StoryHandler {
    private DialogueScreenController DSC;
    public StoryHandler(DialogueScreenController dialogueScreenController) {
        this.DSC = dialogueScreenController;
    }

    public void selectPos(String choice) {
        switch (choice) {
            case "Red":
                System.out.println("Red");
                break;
            case "Blue":
                System.out.println("Blue");
                break;
            case "Green":
                System.out.println("Green");
                break;
        }
    }

    public void test1() {
        DSC.updateChoices("Red","Blue","Green");
        DSC.updateCases("Red","Blue","Green");
    }
}
