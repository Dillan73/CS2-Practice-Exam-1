public class StarshipExplorer {

    // variable declaration section
    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";
    Alien[] aliens = new Alien[50];

    public static void main(String[] args) {
        System.out.println("Hello World! Good luck on your exams!");
        StarshipExplorer starshipExplorer = new StarshipExplorer();

    }

    StarshipExplorer(){
        for(int i = 0; i < 50; i++){
            Integer randEnergy = (int)(Math.random()*75+1);
            Integer randHostility = (int)(Math.random()*101);
            aliens[i] = new Alien(randEnergy, randHostility);
        }
        displayAliens();
        boolean energyDupes = checkEnergy();
        if(energyDupes){
            System.out.println("Multiple aliens have the same energy levels!");
        }else{
            System.out.println("Every alien has a unique energy level!");
        }
        System.out.println("The deciphering of the alien language is: " + decipher(alienLanguage));
    }

    void displayAliens(){
        for(Alien alien : aliens){
            alien.printInfo();
        }
    }

    boolean checkEnergy(){
        for(int i = 0; i < 50; i++){
            for(int j = i+1; j < 50; j++){
                if(aliens[i].getEnergyLevel() == aliens[j].getEnergyLevel()){
                    return true;
                }
            }
        }
        return false;
    }

    String decipher(String input){
        String output = "";
        int index = 0;
        boolean lastWorked = false;
        while(index < input.length()){
            if(lastWorked){
                output += input.charAt(index);
            }
            if(input.charAt(index) == '*'){
                lastWorked = true;
            }else{
                lastWorked = false;
            }
            index++;
        }
        //
        return output;
    }
}
