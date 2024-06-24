from django.shortcuts import render
from rest_framework.viewsets import ModelViewSet
from .serializer import MemberSerializer
from .models import Member

# Create your views here.
class MemberViewSet(ModelViewSet):
    queryset = Member.objects.all()
    serializer_class = MemberSerializer