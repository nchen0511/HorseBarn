public class HorseBarn {

    private Horse[] spaces;

    public HorseBarn(Horse[] spaces){
        this.spaces = spaces;
    }
    public int findHorseSpace(String name){
        for(int i=0;i<this.spaces.length;i++){
            if(this.spaces[i]!=null&&name.equals(this.spaces[i].getName())){
                return i;
            }
        }
        return -1;
    }

    public void consolidate(){
        for(int i=0;i<this.spaces.length-1;i++){
            if(this.spaces[i]==null){
                for(int n=i;n<this.spaces.length-1;n++){
                    this.spaces[n]=this.spaces[n+1];
                }
                this.spaces[this.spaces.length-1]=null;
            }
        }
    }
}