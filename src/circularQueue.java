

public class circularQueue {
    int[] array = new int[5];
    int back = -1;
    int front = -1;

    void enqueue(int value) {

        if((back+1)%5==front){
            System.out.println("queue full");
            return;
        }
        if(front==-1){
            front=0;
        }
        back=back+1%5;
    array[back]=value;
        System.out.println(array
        [back]);

    }

    int dequeue() {
        int val;
        if(isEmpty()){
            return -1;
        }

val=array[front];

        if(front==back){
            front=back=-1;
            }
        else{front=(front+1)%5;}
return val;
}

    private boolean isEmpty() {
        return front==-1&&back==-1;
    }
}