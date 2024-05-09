package dune.file.dunetextgame;

public class StoryHandler {
    int EndingValue = 5;
    private DialogueScreenController DSC;
    public StoryHandler(DialogueScreenController dialogueScreenController) {
        this.DSC = dialogueScreenController;
    }

    public void selectPos(String choice) {
        switch (choice) {
            case "Ascension":
                Ascension();
                break;
            case "War":
                greatWar();
                break;
            case "Rebellion":
                ChaniRebellion();
                break;
            case "Ending":
                ending();
                break;
        }
    }

    public void Ascension() {
        DSC.updateCharacterName("Narrator");
        DSC.updateCharacterDialogue("After the victory of the Lisan al-Gaib, Paul and his ascension to the throne. He ruled the \nLandsraad greatly for he possesed the planet Arakis in which the Melange is located.");

        DSC.updateChoices("Kneel before me","I won but at what cost?","Arise");
        DSC.updateCases("War","War","War");
    }

    public void greatWar(){
        DSC.updateCharacterName("Narrator");
        DSC.updateCharacterDialogue("He stands proud as the emperor of the so called Imperium. \nBut as the Great houses disagree with his rule, the war has continued to surge. \nOne by one the great houses drop until all has been told to obey Paul.");

        DSC.updateChoices("Make them bow to me","Eradicate House Ordos","Know your place");
        DSC.updateCases("Rebellion","Rebellion","Rebellion");
    }

    public void ChaniRebellion(){
        DSC.updateCharacterName("Narrator");
        DSC.updateCharacterDialogue("But in the midst of this Chani who was also in great disbelief of Usul's (Paul) decision has \ntrained in solitary until the day she challenges Paul. \nOn the day that all the great houses has gathered in Arakis \nto properly recognize Paul's ascension to the throne, \narrives Chani, to challenge Paul to a duel.");

        DSC.updateChoices("You Dare challenge your ruler","What have we become Chani","Searching for someone to blame is \n                    such a pain");
        DSC.updateCases("Ending","Ending","Ending");
    }

    public void ending(){
        if (EndingValue <= 20){
            DSC.updateCharacterName("");
            DSC.updateCharacterDialogue("");

            DSC.hideChoiceBox();
        } else if (EndingValue >= 5) {
            DSC.updateCharacterName("");
            DSC.updateCharacterDialogue("");

            DSC.hideChoiceBox();
        } else {
            DSC.updateCharacterName("");
            DSC.updateCharacterDialogue("");

            DSC.hideChoiceBox();
        }
    }


}
