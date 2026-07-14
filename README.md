java.util.ConcurrentModificationException is a runtime exception that occurs when a collection is modified while it is being iterated, typically using an Iterator, enhanced for loop, or similar traversal.

Incorrect 
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");

for (String s : list) {
    if (s.equals("B")) {
        list.remove(s);   // Throws ConcurrentModificationException
    }
}


Correct solution
Use Iterator.remove()
Iterator<String> iterator = list.iterator();

while (iterator.hasNext()) {
    String s = iterator.next();
    if (s.equals("B")) {
        iterator.remove();   // Safe
    }
}
