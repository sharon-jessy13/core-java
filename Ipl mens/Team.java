class Team{
    
    String name;
    int noOfmatches;
    int won;
    int loss;
    String nrr;
    int pts;
    String lastFive[];
    
    public void getTeamInfo(){
    
        System.out.print(
            name + "    " +
            noOfmatches + "           " +
            won + "    " +
            loss + "   " +
            nrr + "     " +
            pts + "   "
        );
        
        for(String match : lastFive){
            System.out.print(" " + match);
        }
    }
}