from django.urls import include, path
from rest_framework.routers import DefaultRouter
from . import views


router = DefaultRouter()
router.register('board', views.BoardViewSet)

urlpatterns = [
    path('', include(router.urls))
]