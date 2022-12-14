package com.example.quotes.data.local

import com.example.quotes.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow


interface QuoteLocalDataSource {
    fun  getQuotes(): Flow<List<QuoteModel>>
    fun  getQuote(quoteId:Int): Flow<QuoteModel>
    fun  getQuoteRandom(): Flow<QuoteModel>

    suspend fun  insertAll(quotes : List<QuoteModel>)
    suspend fun  insert(quote : QuoteModel)
}
