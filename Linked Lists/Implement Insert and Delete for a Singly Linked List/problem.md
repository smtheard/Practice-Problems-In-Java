# Implement Insert and Delete for singly-linked linked list.
Given:
int Insert(node** head, int data)
int Delete(node** head, int deleteMe)

Modified to Java:
void insert(Node head, int data)
void delete(Node head, int deleteMe)

This problem brought up some interesting issues because of the whole "Java passes the reference by value" thing. 

Read more about this issue here:
http://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value