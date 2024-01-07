public class ReportGenerator {
    private SortingStrategy sortingStrategy;

    // setter to allow setting the strategy at run time based on clients choice.
    // we can also pass the SortingStrategy in the constructor if we want.
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    // this method will directly call the sort method of the interface. Which
    // concrete implementatation to call will be decided by the client
    // at run time (Run time polymorphism)
    public Report generateReport(ReportData reportData) {
        this.sortingStrategy.sort(reportData);
    }
}
