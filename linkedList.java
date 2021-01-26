public class linkedList{
    
    //instance varables
    int val;
    linkedList next;
    linkedList head;

    //create empty class
    public linkedList(){
        this.next=null;
        this.head=null;
    }

    //make a val
    public linkedList(int val){
        this.val=val;
    }

    //add a item at the end of linkedlist
    public void add(int val){
        linkedList temp= new linkedList(val);
        if(head == null){
            this.head=temp;
        }
        else{
            linkedList cursor=head;
            while(cursor.next != null){
                cursor=cursor.next;
            }
            cursor.next=temp;
        }
    }

    //delete a node form linked list
    //it will delete the one cloest to the head(the first encontered) if there are simialr numbers in linked list
    public boolean delete(int val){
        //check if entire linked list is empty
        if(head == null){
            System.out.println("no item in linked list");
            return false;
        }
        else{
            //if head is getting deleted
            if(head.val==val && head.next != null){
                head=head.next;
                return true;
            }
            else{
                //make a new cursor which loop thourgh the linkedlist to find the deleting one
                linkedList cursor=head;
                linkedList prev=null;
                while(cursor.next != null){
                    if(cursor.val==val){
                        prev.next=cursor.next;
                        return true;
                    }
                    prev=cursor;
                    cursor=cursor.next;
                }
                if(cursor.val==val){
                    prev.next=cursor.next;
                    return true;
                }
                else{
                    return false;
                }
                
            }
        }

        

    }

    //printout the entire linkedlist
    public void print(){
        linkedList cursor=head;
        while(cursor.next != null){
            System.out.println(cursor.val+" ");
            cursor=cursor.next;
        }
        System.out.println(cursor.val+" ");
        
    }



    public static void main(String[] args){
        linkedList head=new linkedList();
        head.add(3);
        head.add(10);
        head.add(1);
        head.add(10);
        
        head.print();

        System.out.println(head.delete(10));
        System.out.println("After:");
        head.print();
    }
}