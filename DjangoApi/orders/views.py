from django.shortcuts import render
from rest_framework.viewsets import ModelViewSet
from .serializer import OrderSerializer
from .models import Order

# Create your views here.
class OrderViewSet(ModelViewSet):
    queryset = Order.objects.all()
    serializer_class = OrderSerializer