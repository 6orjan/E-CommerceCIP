# Ecommerce API Documentation

## Overview
This document provides an overview and usage guide for the Ecommerce API, which includes three main controllers: `CategoryController`, `ProductController`, and `ReviewController`. Each controller manages operations for categories, products, and reviews respectively.

## CategoryController

### Endpoints

#### Get All Categories
- **URL:** `/api/categories`
- **Method:** `GET`
- **Description:** Retrieves a list of all categories.
- **Response:**
  - `200 OK` with a list of categories.

#### Get Category by ID
- **URL:** `/api/categories/{id}`
- **Method:** `GET`
- **Description:** Retrieves a specific category by its ID.
- **Parameters:**
  - `id` (path): The ID of the category to retrieve.
- **Response:**
  - `200 OK` with the category object.
  - `404 Not Found` if the category does not exist.

#### Create Category
- **URL:** `/api/categories`
- **Method:** `POST`
- **Description:** Creates a new category.
- **Request Body:** Category object.
- **Response:**
  - `201 Created` with the created category object.

#### Add Product to Category
- **URL:** `/api/categories/addProduct/{categoryID}`
- **Method:** `POST`
- **Description:** Adds a product to a specific category.
- **Parameters:**
  - `categoryID` (path): The ID of the category to add the product to.
- **Request Body:** Product object.
- **Response:**
  - `200 OK` with the updated product object.

#### Update Category
- **URL:** `/api/categories/{id}`
- **Method:** `PUT`
- **Description:** Updates an existing category.
- **Parameters:**
  - `id` (path): The ID of the category to update.
- **Request Body:** Updated category object.
- **Response:**
  - `200 OK` with the updated category object.

#### Delete Category
- **URL:** `/api/categories/{id}`
- **Method:** `DELETE`
- **Description:** Deletes a category by its ID.
- **Parameters:**
  - `id` (path): The ID of the category to delete.
- **Response:**
  - `204 No Content`

## ProductController

### Endpoints

#### Get All Products
- **URL:** `/api/products`
- **Method:** `GET`
- **Description:** Retrieves a list of all products.
- **Response:**
  - `200 OK` with a list of products.

#### Get Product by ID
- **URL:** `/api/products/{id}`
- **Method:** `GET`
- **Description:** Retrieves a specific product by its ID.
- **Parameters:**
  - `id` (path): The ID of the product to retrieve.
- **Response:**
  - `200 OK` with the product object.
  - `404 Not Found` if the product does not exist.

#### Create Product
- **URL:** `/api/products`
- **Method:** `POST`
- **Description:** Creates a new product.
- **Request Body:** Product object.
- **Response:**
  - `201 Created` with the created product object.

#### Update Product
- **URL:** `/api/products/{id}`
- **Method:** `PUT`
- **Description:** Updates an existing product.
- **Parameters:**
  - `id` (path): The ID of the product to update.
- **Request Body:** Updated product object.
- **Response:**
  - `200 OK` with the updated product object.

#### Delete Product
- **URL:** `/api/products/{id}`
- **Method:** `DELETE`
- **Description:** Deletes a product by its ID.
- **Parameters:**
  - `id` (path): The ID of the product to delete.
- **Response:**
  - `204 No Content`

## ReviewController

### Endpoints

#### Get All Reviews
- **URL:** `/api/reviews`
- **Method:** `GET`
- **Description:** Retrieves a list of all reviews.
- **Response:**
  - `200 OK` with a list of reviews.

#### Get Review by ID
- **URL:** `/api/reviews/{id}`
- **Method:** `GET`
- **Description:** Retrieves a specific review by its ID.
- **Parameters:**
  - `id` (path): The ID of the review to retrieve.
- **Response:**
  - `200 OK` with the review object.
  - `404 Not Found` if the review does not exist.

#### Create Review
- **URL:** `/api/reviews`
- **Method:** `POST`
- **Description:** Creates a new review.
- **Request Body:** Review object.
- **Response:**
  - `201 Created` with the created review object.

#### Update Review
- **URL:** `/api/reviews/{id}`
- **Method:** `PUT`
- **Description:** Updates an existing review.
- **Parameters:**
  - `id` (path): The ID of the review to update.
- **Request Body:** Updated review object.
- **Response:**
  - `200 OK` with the updated review object.

#### Delete Review
- **URL:** `/api/reviews/{id}`
- **Method:** `DELETE`
- **Description:** Deletes a review by its ID.
- **Parameters:**
  - `id` (path): The ID of the review to delete.
- **Response:**
  - `204 No Content`

Summary of Relationships
Category-Product Relationship:

A Category can have multiple Product entities (one-to-many relationship).
A Product belongs to a single Category (many-to-one relationship).
Product-Review Relationship:

A Product can have multiple Review entities (one-to-many relationship).
A Review is associated with a single Product (many-to-one relationship).
