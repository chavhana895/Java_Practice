package LinkedHashMap;

public class LHM 
{
 Node [] a= new Node[5];
 Node root;
 
 void put(int key,String value)
 {
	 //Created Obj
	 Node obj=new Node(key,value);
	 //Add in hashMap;
	 int index=key%a.length;
	 if(a[index]==null)
	 {
		 a[index]=obj;
	 }
	 else
	 {
		 Node temp=a[index];
		 while(temp.hashNext!=null)
		 {
			 temp=temp.hashNext;
		 }
		 temp.hashNext=obj;
	 }
//Add in LinkedList
	 if(root==null)
	 {
		 root=obj;
	 }
	 else
	 {
		 Node temp=root;
		 while(temp.linkedNext!=null)
		 {
			 temp=temp.linkedNext;
		 }
		 temp.linkedNext=obj;
	 }
 }
 
 void print()
 {
	 Node temp=root;
	 while(temp!=null)
	 {
		 System.out.println(temp.key+" "+temp.value);
		 temp=temp.linkedNext;
	 }
 }
 
 String get(int key)
 {
	 int index=key%a.length;
	 Node temp=a[index];
	 while(temp!=null)
	 {
		 if(temp.key==key)
			 return temp.value;
		 temp=temp.hashNext;
	 }
	 return null;
 }
}
