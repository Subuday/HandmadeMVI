package com.readdle.handmademvi

import kotlinx.coroutines.flow.Flow

typealias Actor<State, Wish, Effect> = (state: State, wish: Wish) -> Flow<Effect>
