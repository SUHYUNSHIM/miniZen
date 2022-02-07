package gscdn.miniZen.model.page;

//검색, 타입 선택 시 .
public class SearchCriteria extends Criteria{
    private String searchType = "";
    private String keyword = "";

    public String getSearchType() {
        return searchType;
    }
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    @Override
    public String toString() {
        return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + "]";
    }
}
