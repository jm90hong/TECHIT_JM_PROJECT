from django.shortcuts import render
from rest_framework.viewsets import ModelViewSet
from .serializer import BoardSerializer
from .models import Board

# Create your views here.
class BoardViewSet(ModelViewSet):
    queryset = Board.objects.all()
    serializer_class = BoardSerializer