package Builder;

public class URLBuilder {

    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;
    public URLBuilder protocol(String protocol){
        this.protocol = protocol;
        return this;
    }
    public URLBuilder hostname(String hostname){
        this.hostname = hostname;
        return this;
    }
    public URLBuilder port(String port){
        this.port = port;
        return this;
    }
    public URLBuilder pathParam(String pathParam){
        this.pathParam = pathParam;
        return this;
    }
    public URLBuilder queryParam(String queryParam){
        this.queryParam = queryParam;
        return this;
    }

    public String URL(){

        StringBuilder url= new StringBuilder();

        url.append(this.protocol).append(this.hostname);

        if(this.port != null){
            url.append(this.port);
        }
        if(this.pathParam !=null){
            url.append(this.pathParam);
        }
        if(this.queryParam !=null){
            url.append(this.queryParam);
        }

        return url.toString();
    }


}
