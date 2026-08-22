class Season{
    
    int name;
    
    Team teams[];
    
    public void getSeasonInfo(){
        System.out.println("season : " + name);
        
        System.out.println("IPL Team information");
        
        System.out.println(
            "name " +
            "noOfmatches  " +
            "won  " +
            "loss " +
            "  nrr    " +
            " pts " +
            " Last five"
        );
        
        for (Team team : teams){
            team.getTeamInfo();
            System.out.println();
        }
    }
}