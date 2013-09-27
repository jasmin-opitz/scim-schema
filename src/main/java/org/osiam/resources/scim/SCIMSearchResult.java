/*
 * for licensing see the file license.txt.
 */

package org.osiam.resources.scim;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: phil
 * Date: 5/16/13
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class SCIMSearchResult<T> {

    private long totalResults;
    private long itemsPerPage;
    private long startIndex;
    private Set<String> schemas;
    private List<T> resources;

    public SCIMSearchResult() {}

    public SCIMSearchResult(List<T> resources, long totalResults, long itemsPerPage, long startIndex, Set<String> schemas) {
        this.resources = resources;
        this.totalResults = totalResults;
        this.itemsPerPage = itemsPerPage;
        this.startIndex = startIndex;
        this.schemas = schemas;
    }

    @JsonProperty("Resources")
    public List<T> getResources() {
        return resources;
    }

    public long getTotalResults() {
        return totalResults;
    }

    public Set<String> getSchemas() {
        return schemas;
    }

    public long getItemsPerPage() {
        return itemsPerPage;
    }

    public long getStartIndex() {
        return startIndex;
    }
}