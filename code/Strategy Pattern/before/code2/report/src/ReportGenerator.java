public class ReportGenerator {
    public Report sortReport(ReportData reportData, String sortByColumn) {
        if (sortByColumn == "name") {
            return sortReportByName(reportData);
        } else if (sortByColumn == "productNumber") {
            return sortReportByProductNumber(reportData);
        } else {
            return sortReportByDate(reportData);
        }
    }

    private Report sortReportByName(ReportData reportData) {
        // sort the report based on date column
    }

    private Report sortReportByProductNumber(ReportData reportData) {
        // sort the report based on product number
    }

    private Report sortReportByDate(ReportData reportData) {
        // sort the report based on name column
    }
}
