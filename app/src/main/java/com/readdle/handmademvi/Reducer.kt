package com.readdle.handmademvi

typealias Reducer<State, Effect> = (state: State, effect: Effect) -> State