package com.example.nmedia

interface ActionListener{
    fun onLikeClick(post: Post)
    fun onShareClick(post: Post)
    fun onRemoveClick(post: Post)
    fun onEditClick(post: Post)
    fun onCancelEditClick(post: Post)
}