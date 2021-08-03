package com.project.gitUser.network.apis

import com.project.gitUser.network.GitSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Github API communication setup via Retrofit.
 *
 */
interface GitApis {
    //The Example Query:
    // https://api.github.com/search/repositories?sort=stars&q=Android&page=1&page_size=10
    @GET("search/repositories?sort=stars")
    suspend fun searchRepos(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") itemsPerPage: Int
    ): GitSearchResponse
}