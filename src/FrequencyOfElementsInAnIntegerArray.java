import java.util.HashMap;
public class FrequencyOfElementsInAnIntegerArray {
    public static void main(String[]args){
        int [] arr = {2,1,5,3,5,4,7,8,6,5,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
}
