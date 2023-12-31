package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Feed(
    @SerialName("pageProps")
    val pageProps: PageProps
)

@Serializable
data class PageProps(
    @SerialName("featuredTemplateCategoriesResponse")
    val featuredTemplateCategoriesResponse: List<FeaturedTemplateCategoriesResponse>,
    @SerialName("preview")
    val preview: Boolean,
    @SerialName("templateAndCreatorsByPopularity")
    val templateAndCreatorsByPopularity: List<TemplateAndCreatorsByPopularity>,
    @SerialName("templateCollections")
    val templateCollections: List<TemplateCollection>,
    @SerialName("templateCreatorsResponse")
    val templateCreatorsResponse: List<TemplateCreatorsResponse>,
    @SerialName("topTemplateCategoriesResponse")
    val topTemplateCategoriesResponse: List<TopTemplateCategoriesResponse>,
    @SerialName("totalCategoryCount")
    val totalCategoryCount: Int,
    @SerialName("totalCreatorCount")
    val totalCreatorCount: Int,
    @SerialName("totalTemplateCollectionsCount")
    val totalTemplateCollectionsCount: Int
)

@Serializable
data class FeaturedTemplateCategoriesResponse(
    @SerialName("asset")
    val asset: Asset,
    @SerialName("assetPosition")
    val assetPosition: String,
    @SerialName("link")
    val link: Link,
    @SerialName("notionIcon")
    val notionIcon: String,
    @SerialName("notionIconColor")
    val notionIconColor: String,
    @SerialName("numberOfTemplates")
    val numberOfTemplates: Int,
    @SerialName("title")
    val title: String
)

@Serializable
data class TemplateAndCreatorsByPopularity(
    @SerialName("all_tags")
    val allTags: List<String>,
    @SerialName("attributes")
    val attributes: Attributes,
    @SerialName("authors")
    val authors: List<String>,
    @SerialName("block_id")
    val blockId: String?,
    @SerialName("body")
    val body: Body,
    @SerialName("categories")
    val categories: List<Category>,
    @SerialName("contentful_id")
    val contentfulId: String,
    @SerialName("created_at")
    val createdAt: Long,
    @SerialName("creator")
    val creator: Creator,
    @SerialName("description")
    val description: String,
    @SerialName("id")
    val id: String,
    @SerialName("last_synced_at")
    val lastSyncedAt: Long,
    @SerialName("last_updated_at")
    val lastUpdatedAt: Long,
    @SerialName("locale")
    val locale: String,
    @SerialName("made_by")
    val madeBy: String,
    @SerialName("name")
    val name: String,
    @SerialName("number_of_duplicates")
    val numberOfDuplicates: Int,
    @SerialName("price")
    val price: Int?,
    @SerialName("published_version")
    val publishedVersion: Int,
    @SerialName("score_1")
    val score1: Int,
    @SerialName("score_2")
    val score2: Int,
    @SerialName("score_3")
    val score3: Int,
    @SerialName("score_4")
    val score4: Int,
    @SerialName("score_5")
    val score5: Int,
    @SerialName("show_in_gallery")
    val showInGallery: Boolean,
    @SerialName("slug")
    val slug: String,
    @SerialName("tags")
    val tags: List<String>,
    @SerialName("version")
    val version: Int
)

@Serializable
data class TemplateCollection(
    @SerialName("author")
    val author: String,
    @SerialName("authorHandle")
    val authorHandle: String,
    @SerialName("avatar")
    val avatar: Avatar,
    @SerialName("color")
    val color: String,
    @SerialName("description")
    val description: String,
    @SerialName("heading")
    val heading: String,
    @SerialName("images")
    val images: List<ImageXX>,
    @SerialName("longDescription")
    val longDescription: LongDescription,
    @SerialName("metaDescription")
    val metaDescription: String,
    @SerialName("metaTitle")
    val metaTitle: String,
    @SerialName("mobileImages")
    val mobileImages: List<MobileImageX>,
    @SerialName("slug")
    val slug: String
)

@Serializable
data class TemplateCreatorsResponse(
    @SerialName("avatar")
    val avatar: AvatarX,
    @SerialName("description")
    val description: String,
    @SerialName("link")
    val link: Link,
    @SerialName("numberOfTemplates")
    val numberOfTemplates: Int,
    @SerialName("title")
    val title: String
)

@Serializable
data class TopTemplateCategoriesResponse(
    @SerialName("asset")
    val asset: Asset,
    @SerialName("assetPosition")
    val assetPosition: String,
    @SerialName("link")
    val link: Link,
    @SerialName("notionIcon")
    val notionIcon: String,
    @SerialName("notionIconColor")
    val notionIconColor: String,
    @SerialName("numberOfTemplates")
    val numberOfTemplates: Int,
    @SerialName("title")
    val title: String
)

@Serializable
data class Asset(
    @SerialName("height")
    val height: Int,
    @SerialName("src")
    val src: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class Link(
    @SerialName("href")
    val href: String
)

@Serializable
data class Attributes(
    @SerialName("emoji")
    val emoji: String,
    @SerialName("icon")
    val icon: String?,
    @SerialName("image")
    val notionImage: NotionImage,
    @SerialName("mobile_image")
    val mobileImage: MobileImage,
    @SerialName("mobile_screenshots")
    val mobileScreenshots: List<MobileScreenshot>?,
    @SerialName("public_site_url")
    val publicSiteUrl: String?,
    @SerialName("purchase_url")
    val purchaseUrl: String?,
    @SerialName("screenshots")
    val screenshots: List<Screenshot>?,
    @SerialName("serialized_body")
    val serializedBody: String
)

@Serializable
data class Body(
    @SerialName("content")
    val content: List<Content>,
    @SerialName("nodeType")
    val nodeType: String
)

@Serializable
data class Category(
    @SerialName("attributes")
    val attributes: AttributesX,
    @SerialName("contentful_id")
    val contentfulId: String,
    @SerialName("created_at")
    val createdAt: Long,
    @SerialName("description")
    val description: String,
    @SerialName("featured_template_contentful_ids")
    val featuredTemplateContentfulIds: List<String>?,
    @SerialName("icon")
    val icon: Icon,
    @SerialName("id")
    val id: String,
    @SerialName("last_synced_at")
    val lastSyncedAt: Long,
    @SerialName("last_updated_at")
    val lastUpdatedAt: Long,
    @SerialName("locale")
    val locale: String,
    @SerialName("name")
    val name: String,
    @SerialName("number_of_templates")
    val numberOfTemplates: Int,
    @SerialName("published_version")
    val publishedVersion: Int,
    @SerialName("score_1")
    val score1: Int,
    @SerialName("score_2")
    val score2: Int,
    @SerialName("score_3")
    val score3: Int,
    @SerialName("score_4")
    val score4: Int,
    @SerialName("score_5")
    val score5: Int,
    @SerialName("slug")
    val slug: String,
    @SerialName("subcategory_contentful_ids")
    val subcategoryContentfulIds: List<String>?,
    @SerialName("template_image")
    val templateImage: TemplateImage,
    @SerialName("version")
    val version: Int
)

@Serializable
data class Creator(
    @SerialName("attributes")
    val attributes: AttributesXX,
    @SerialName("contentful_id")
    val contentfulId: String,
    @SerialName("created_at")
    val createdAt: Long,
    @SerialName("email")
    val email: String,
    @SerialName("id")
    val id: String,
    @SerialName("is_certified_consultant")
    val isCertifiedConsultant: Boolean,
    @SerialName("is_featured_creator")
    val isFeaturedCreator: Boolean?,
    @SerialName("is_template_creator")
    val isTemplateCreator: Boolean,
    @SerialName("last_synced_at")
    val lastSyncedAt: Long,
    @SerialName("last_updated_at")
    val lastUpdatedAt: Long,
    @SerialName("name")
    val name: String,
    @SerialName("number_of_duplicates")
    val numberOfDuplicates: Int,
    @SerialName("number_of_templates")
    val numberOfTemplates: Int,
    @SerialName("published_version")
    val publishedVersion: Int,
    @SerialName("score_1")
    val score1: Int,
    @SerialName("score_2")
    val score2: Int,
    @SerialName("score_3")
    val score3: Int,
    @SerialName("score_4")
    val score4: Int,
    @SerialName("score_5")
    val score5: Int,
    @SerialName("tags")
    val tags: List<String>,
    @SerialName("template_image")
    val templateImage: TemplateImage?,
    @SerialName("user_id")
    val userId: String,
    @SerialName("username")
    val username: String,
    @SerialName("version")
    val version: Int
)

@Serializable
data class NotionImage(
    @SerialName("height")
    val height: Int,
    @SerialName("url")
    val url: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class MobileImage(
    @SerialName("height")
    val height: Int,
    @SerialName("url")
    val url: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class MobileScreenshot(
    @SerialName("height")
    val height: Int,
    @SerialName("url")
    val url: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class Screenshot(
    @SerialName("height")
    val height: Int,
    @SerialName("url")
    val url: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class Content(
    @SerialName("content")
    val content: List<ContentX>,
    @SerialName("nodeType")
    val nodeType: String
)

@Serializable
data class ContentX(
    @SerialName("nodeType")
    val nodeType: String,
    @SerialName("value")
    val value: String
)

@Serializable
data class AttributesX(
    @SerialName("ancestor_contentful_ids")
    val ancestorContentfulIds: List<String>?,
    @SerialName("do_not_use")
    val doNotUse: Int,
    @SerialName("related_content")
    val relatedContent: List<RelatedContent>?
)

@Serializable
data class Icon(
    @SerialName("color")
    val color: String,
    @SerialName("name")
    val name: String
)

@Serializable
data class TemplateImage(
    @SerialName("height")
    val height: Int,
    @SerialName("url")
    val url: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class RelatedContent(
    @SerialName("contentful_id")
    val contentfulId: String,
    @SerialName("type")
    val type: String
)

@Serializable
data class AttributesXX(
    @SerialName("description")
    val description: String?,
    @SerialName("image")
    val notionImage: NotionImage,
    @SerialName("jobTitle")
    val jobTitle: String?,
    @SerialName("links")
    val links: List<String>
)

@Serializable
data class Avatar(
    @SerialName("alt")
    val alt: String,
    @SerialName("height")
    val height: Int,
    @SerialName("src")
    val src: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class ImageXX(
    @SerialName("alt")
    val alt: String,
    @SerialName("height")
    val height: Int,
    @SerialName("src")
    val src: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class LongDescription(
    @SerialName("nodeType")
    val nodeType: String
)

@Serializable
data class MobileImageX(
    @SerialName("alt")
    val alt: String,
    @SerialName("height")
    val height: Int,
    @SerialName("src")
    val src: String,
    @SerialName("width")
    val width: Int
)

@Serializable
data class AvatarX(
    @SerialName("height")
    val height: Int,
    @SerialName("id")
    val id: String,
    @SerialName("src")
    val src: String,
    @SerialName("width")
    val width: Int
)