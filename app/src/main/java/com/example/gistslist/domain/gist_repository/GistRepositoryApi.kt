package com.example.gistslist.domain.gist_repository

import com.example.gistslist.models.data.pojo.gist_info.GistInfoBean
import com.example.gistslist.models.data.pojo.gist_list.GistBean
import io.reactivex.Single

/**
 * Репозиторий для работы со списком гистов
 *
 * @author Dmitrii Bondarev on 10.11.2020
 */
interface GistRepositoryApi {
	/**
	 * Загрузка POJO объектов для основного списка гистов
	 *
	 * @return Возвращает Single объект с POJO для основного списка гистов
	 */
	fun loadGistsList() : Single<List<GistBean>>

	fun loadGistById(gistId: String) : Single<GistInfoBean>
}