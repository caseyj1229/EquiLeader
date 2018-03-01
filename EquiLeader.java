import java.util.HashMap;

public class EquiLeader {
    public static int solution(int[] A){
        //First, find leader of entire array
        HashMap<Integer,Integer> leadMap = new HashMap<>();
        for(int i = 0; i<A.length;i++){
            if(!leadMap.containsKey(A[i])){
                leadMap.put(A[i],1);
            }
            else{
                leadMap.put(A[i],(leadMap.get(A[i]))+1);
            }
        }

        //Iterate over all keys in the map to find max value
        int Count = 1;
        int Value = A[0];
        for(int leader : leadMap.keySet()){
            if(leadMap.get(leader) > Count){
               Count = leadMap.get(leader);
               Value = leader;
            }
        }

        //Check if leader exists
        if(Count <= (A.length*0.5)){
            return 0;
        }

        //Check if tempLeaders exist on left side
        int tempLeaders = 0;
        int equileaders = 0;

        for(int i = 0; i<A.length;i++){
            if(A[i] == Value){
                tempLeaders++;
            }

            if(tempLeaders > (0.5)*(i+1)){
                //tempLeader exists on left, now check right
                if((Count-tempLeaders) > (0.5*(A.length-i-1))){
                    equileaders++;
                }
            }
        }

        return equileaders;
    }
}
