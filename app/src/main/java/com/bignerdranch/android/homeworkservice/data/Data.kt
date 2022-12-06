package com.bignerdranch.android.homeworkservice.data


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("alt_artist_ids")
    val altArtistIds: List<Any>,
    @SerializedName("alt_classification_ids")
    val altClassificationIds: List<String>,
    @SerializedName("alt_image_ids")
    val altImageIds: List<Any>,
    @SerializedName("alt_material_ids")
    val altMaterialIds: List<String>,
    @SerializedName("alt_style_ids")
    val altStyleIds: List<Any>,
    @SerializedName("alt_subject_ids")
    val altSubjectIds: List<String>,
    @SerializedName("alt_technique_ids")
    val altTechniqueIds: List<Any>,
    @SerializedName("alt_titles")
    val altTitles: Any,
    @SerializedName("api_link")
    val apiLink: String,
    @SerializedName("api_model")
    val apiModel: String,
    @SerializedName("artist_display")
    val artistDisplay: String,
    @SerializedName("artist_id")
    val artistId: Int,
    @SerializedName("artist_ids")
    val artistIds: List<Int>,
    @SerializedName("artist_title")
    val artistTitle: String,
    @SerializedName("artist_titles")
    val artistTitles: List<String>,
    @SerializedName("artwork_type_id")
    val artworkTypeId: Int,
    @SerializedName("artwork_type_title")
    val artworkTypeTitle: String,
    @SerializedName("boost_rank")
    val boostRank: Int,
    @SerializedName("catalogue_display")
    val catalogueDisplay: Any,
    @SerializedName("category_ids")
    val categoryIds: List<String>,
    @SerializedName("category_titles")
    val categoryTitles: List<String>,
    @SerializedName("classification_id")
    val classificationId: String,
    @SerializedName("classification_ids")
    val classificationIds: List<String>,
    @SerializedName("classification_title")
    val classificationTitle: String,
    @SerializedName("classification_titles")
    val classificationTitles: List<String>,
    @SerializedName("color")
    val color: Color,
    @SerializedName("colorfulness")
    val colorfulness: Double,
    @SerializedName("copyright_notice")
    val copyrightNotice: Any,
    @SerializedName("credit_line")
    val creditLine: String,
    @SerializedName("date_display")
    val dateDisplay: String,
    @SerializedName("date_end")
    val dateEnd: Int,
    @SerializedName("date_qualifier_id")
    val dateQualifierId: Any,
    @SerializedName("date_qualifier_title")
    val dateQualifierTitle: String,
    @SerializedName("date_start")
    val dateStart: Int,
    @SerializedName("department_id")
    val departmentId: String,
    @SerializedName("department_title")
    val departmentTitle: String,
    @SerializedName("dimensions")
    val dimensions: String,
    @SerializedName("document_ids")
    val documentIds: List<String>,
    @SerializedName("exhibition_history")
    val exhibitionHistory: Any,
    @SerializedName("fiscal_year")
    val fiscalYear: Int,
    @SerializedName("fiscal_year_deaccession")
    val fiscalYearDeaccession: Any,
    @SerializedName("gallery_id")
    val galleryId: Int,
    @SerializedName("gallery_title")
    val galleryTitle: String,
    @SerializedName("has_advanced_imaging")
    val hasAdvancedImaging: Boolean,
    @SerializedName("has_educational_resources")
    val hasEducationalResources: Boolean,
    @SerializedName("has_multimedia_resources")
    val hasMultimediaResources: Boolean,
    @SerializedName("has_not_been_viewed_much")
    val hasNotBeenViewedMuch: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_id")
    val imageId: String,
    @SerializedName("inscriptions")
    val inscriptions: Any,
    @SerializedName("internal_department_id")
    val internalDepartmentId: Int,
    @SerializedName("is_boosted")
    val isBoosted: Boolean,
    @SerializedName("is_on_view")
    val isOnView: Boolean,
    @SerializedName("is_public_domain")
    val isPublicDomain: Boolean,
    @SerializedName("is_zoomable")
    val isZoomable: Boolean,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("latlon")
    val latlon: String,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("main_reference_number")
    val mainReferenceNumber: String,
    @SerializedName("material_id")
    val materialId: String,
    @SerializedName("material_ids")
    val materialIds: List<String>,
    @SerializedName("material_titles")
    val materialTitles: List<String>,
    @SerializedName("max_zoom_window_size")
    val maxZoomWindowSize: Int,
    @SerializedName("medium_display")
    val mediumDisplay: String,
    @SerializedName("on_loan_display")
    val onLoanDisplay: Any,
    @SerializedName("place_of_origin")
    val placeOfOrigin: String,
    @SerializedName("provenance_text")
    val provenanceText: Any,
    @SerializedName("publication_history")
    val publicationHistory: Any,
    @SerializedName("publishing_verification_level")
    val publishingVerificationLevel: String,
    @SerializedName("section_ids")
    val sectionIds: List<Any>,
    @SerializedName("section_titles")
    val sectionTitles: List<Any>,
    @SerializedName("site_ids")
    val siteIds: List<Any>,
    @SerializedName("sound_ids")
    val soundIds: List<Any>,
    @SerializedName("source_updated_at")
    val sourceUpdatedAt: String,
    @SerializedName("style_id")
    val styleId: String,
    @SerializedName("style_ids")
    val styleIds: List<String>,
    @SerializedName("style_title")
    val styleTitle: String,
    @SerializedName("style_titles")
    val styleTitles: List<String>,
    @SerializedName("subject_id")
    val subjectId: String,
    @SerializedName("subject_ids")
    val subjectIds: List<String>,
    @SerializedName("subject_titles")
    val subjectTitles: List<String>,
    @SerializedName("suggest_autocomplete_all")
    val suggestAutocompleteAll: List<SuggestAutocompleteAll>,
    @SerializedName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String,
    @SerializedName("technique_id")
    val techniqueId: String,
    @SerializedName("technique_ids")
    val techniqueIds: List<String>,
    @SerializedName("technique_titles")
    val techniqueTitles: List<String>,
    @SerializedName("term_titles")
    val termTitles: List<String>,
    @SerializedName("text_ids")
    val textIds: List<String>,
    @SerializedName("theme_titles")
    val themeTitles: List<String>,
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail,
    @SerializedName("timestamp")
    val timestamp: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("video_ids")
    val videoIds: List<Any>
)