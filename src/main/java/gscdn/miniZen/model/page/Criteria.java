package gscdn.miniZen.model.page;

public class Criteria {

    private int page;
    private int perPageNum;
    private int rowStart;
    private int rowEnd;

    public Criteria(){
        this.page = 1;
        this.perPageNum = 10;
    }

    public void setPage(int page){
        if(page<=0){
            this.page = 1;
            return;
        }
        this.page = page;
    }

    public void setPerPageNum(int perPageNum){
        if(perPageNum<=0 || perPageNum >1000){
            this.perPageNum = 10;
            return;
        }
        this.perPageNum = perPageNum;
    }
    public int getPage(){
        return page;
    }
    public int getPerPageStart(){
        return (this.page -1) * perPageNum;
    }
    public int getPerPageNum(){
        return this.perPageNum;
    }
    public int getRowStart(){
        rowStart = ((page -1) * perPageNum)+1;
        return rowStart;
    }
    public int getRowEnd(){
        rowEnd = rowStart + perPageNum -1;
        return rowEnd;
    }
    @Override
    public String toString(){
        return "페이지 정보[전체 페이지 수=" + page +", 한 페이지 당 컬럼수=" +perPageNum+", 행시작번호="+rowStart+", 행끝번호="+rowEnd+"]";
    }
}
