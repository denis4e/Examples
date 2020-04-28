package collections.set;
import java.util.*;
public class SetsSamples {
	 private HashSet<Integer> HSet;
	 private TreeSet<Integer> treeSet;
	 private LinkedHashSet<Integer> linkedHashSet;
public SetsSamples(int count){
	    HSet = new HashSet<Integer>();
	    treeSet = new TreeSet<Integer>();
	    linkedHashSet = new LinkedHashSet<Integer>();
	    fillSets(count);}
private void fillSets(int count) {
		Random rand = new Random();
	    for(int i = 0; i < count; i++){
	        Integer element = rand.nextInt(100);
	        HSet.add(element);
	        treeSet.add(element);
	        linkedHashSet.add(element);}}
public void print(){
    System.out.println("HashSet: t" + HSet.toString() + " (" + HSet.size() + ")");
    System.out.println("TreeSet: t" + treeSet.toString() + " (" + treeSet.size() + ")");
    System.out.println("LinkedHashSet: t" + linkedHashSet.toString() + " (" + linkedHashSet.size() + ")");
    System.out.println("");}
public void clear(){
    HSet.clear();}
public void removeMax(){
    Integer max = treeSet.last();
    treeSet.remove(max);}
public void iterate(){
    Iterator<Integer> it = linkedHashSet.iterator();
    while(it.hasNext()){
        Integer element = it.next();
        if(element/2<25){
            it.remove();}}}
public void create(){
    HSet = new HashSet<Integer>(treeSet);}
public void removeAll(){
    HSet.removeAll(linkedHashSet);}
public void retainAll(){
    HSet.retainAll(linkedHashSet);}}
