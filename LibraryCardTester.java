public class LibraryCardTester {
    
    public static void main(String[] args){

        LibraryCard james = new LibraryCard("New", false);
        LibraryCard charles = new LibraryCard("Member", true);
        LibraryCard justin = new LibraryCard("New", true);

        System.out.println("Expected: true" + justin.returnBook());
        System.out.println("Expected: true" + james.toString().equals(justin.toString()));
        System.out.println("Expected: false" + justin.updateMembership("Member").equals("New"));
        System.out.println("Expected: false" + (charles.passDay(1) == 5));

    }

}
