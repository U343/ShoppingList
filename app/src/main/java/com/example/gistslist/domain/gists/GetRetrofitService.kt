package com.example.gistslist.domain.gists

import com.example.gistslist.data.gist_retrofit.query_interface.GistsRetrofitRequests
import com.example.gistslist.data.gist_retrofit.retrofit_object.CreateRetrofitServiceApi

class GetRetrofitService : GistsServiceApi {
	override fun getRetrofitService(): GistsRetrofitRequests {
		return CreateRetrofitServiceApi().getRetrofitService()
	}
}