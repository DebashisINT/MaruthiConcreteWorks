package com.breezefieldmaruthiconcreteworks.app.utils.swipemenulayout.listener;


import com.breezefieldmaruthiconcreteworks.app.utils.swipemenulayout.SwipeMenuLayout;

public interface SwipeFractionListener {
    void beginMenuSwipeFraction(SwipeMenuLayout swipeMenuLayout, float fraction);

    void endMenuSwipeFraction(SwipeMenuLayout swipeMenuLayout, float fraction);
}
