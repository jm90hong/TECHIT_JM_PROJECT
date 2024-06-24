from django.shortcuts import render
from rest_framework.viewsets import ModelViewSet
from .seiralizer import ProductSerializer
from .models import Product

# Create your views here.
class ProductViewSet(ModelViewSet):
    queryset = Product.objects.all()
    serializer_class = ProductSerializer