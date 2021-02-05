package com.example.androidjetpackcompose.domain.model

import com.example.androidjetpackcompose.network.model.RecipeNetworkEntity
import com.example.androidjetpackcompose.util.EntityMapper

class RecipeNetworkMapper : EntityMapper<RecipeNetworkEntity, Recipe> {
    override fun mapFromEntity(entity: RecipeNetworkEntity): Recipe {
        return Recipe(
            id = entity.pk,
            title = entity.title,
            publisher = entity.publisher,
            featuredImage = entity.featured_image,
            rating = entity.rating,
            sourceUrl = entity.source_url,
            description = entity.description,
            cookingInstructions = entity.cooking_instructions,
            ingredients = entity.ingredients,
            dateAdded = entity.date_added,
            dateUpdated = entity.date_updated

        )
    }

    override fun toEntity(domainModel: Recipe): RecipeNetworkEntity {
        return RecipeNetworkEntity(
            pk = domainModel.id,
            title = domainModel.title,
            publisher = domainModel.publisher,
            featured_image = domainModel.featuredImage,
            rating = domainModel.rating,
            source_url = domainModel.sourceUrl,
            description = domainModel.description,
            cooking_instructions = domainModel.cookingInstructions,
            ingredients = domainModel.ingredients,
            date_added = domainModel.dateAdded,
            date_updated = domainModel.dateUpdated

        )
    }

    fun mapFromEntityList(initial: List<RecipeNetworkEntity>): List<Recipe> {
        return initial.map { mapFromEntity(it) }
    }

    fun mapToEntityList(initial: List<Recipe>): List<RecipeNetworkEntity> {
        return initial.map { toEntity(it) }
    }
}